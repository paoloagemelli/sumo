/*
 * GeometricInteractiveVDSLayerPanel.java
 *
 * Created on June 18, 2008, 5:12 PM
 */

package org.geoimage.viewer.widget.panels;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

import org.apache.commons.lang3.StringUtils;
import org.geoimage.opengl.OpenGLContext;
import org.geoimage.viewer.core.Platform;
import org.geoimage.viewer.core.api.ILayer;
import org.geoimage.viewer.core.layers.AttributesGeometry;
import org.geoimage.viewer.core.layers.GeometricLayer;
import org.geoimage.viewer.core.layers.visualization.vectors.ComplexEditVDSVectorLayer;

import com.vividsolutions.jts.geom.Geometry;



final class FlagTableModel extends javax.swing.table.DefaultTableModel {
	private static final long serialVersionUID = 1L;

	FlagTableModel(Object[][] object, String[] string) {
        super(object, string);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex == 0)
            return String.class;
        else
        	//checkbox
            return Boolean.class;
    }
}




/**
 *
 * @author  leforth
 */
public class GeometricInteractiveVDSLayerPanel extends javax.swing.JPanel implements KeyListener{
	class FlagTable extends JTable{
		private static final long serialVersionUID = 1L;

		@Override
	    public void valueChanged(ListSelectionEvent e){
	        super.valueChanged(e);
	        if(getSelectedRow()>=0){
	        	if(dataModel instanceof GeometricInteractiveVDSLayerModel)
	        		((GeometricInteractiveVDSLayerModel)dataModel).changeSelection(getSelectedRow(), display);
	        }	
	    }
	   
	};
	
	private javax.swing.JScrollPane jScrollPaneTableData;
    private javax.swing.JTable tableDataLayer;
    
    private javax.swing.JTable flagTable = new FlagTable();
    private GeometricInteractiveVDSLayerModel glm;
    private boolean display = true;
    private List<Geometry> deleted = new ArrayList<Geometry>();
    private List<AttributesGeometry> attrDeleted = new ArrayList<AttributesGeometry>();
    private ILayer layer;
    
    private FlagTableModel debugTableModel = new FlagTableModel(
    		new Object [][] {},
            new String [] {"Debug Layer", "Status"}
     );
    
    
    private class CellRender extends DefaultTableCellRenderer {
		
		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			String val=StringUtils.join((Double[])value,',');
			setValue(val);
			return this;
		}
	};
        
    
    /** Creates new form GeometricInteractiveVDSLayerPanel */
    public GeometricInteractiveVDSLayerPanel(ILayer layer) {
        this.layer = layer;
        initComponents();
        glm=new GeometricInteractiveVDSLayerModel(layer);
        ((FlagTable)tableDataLayer).setModel(glm);
        tableDataLayer.addKeyListener(this);
        tableDataLayer.setDefaultRenderer(double[].class,new CellRender());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        setName("Form"); // NOI18N
        
        jScrollPaneTableData = new javax.swing.JScrollPane();
        jScrollPaneTableData.setName("Vector Data Layer"); // NOI18N
        
        javax.swing.JScrollPane jScrollPaneCheckboxFlag = new javax.swing.JScrollPane();

        tableDataLayer = new FlagTable();
        tableDataLayer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDataLayer.setName("Vector Layer Data"); // NOI18N
        jScrollPaneTableData.setViewportView(tableDataLayer);

        // add check boxes for debug information
        List<String> geometriestaglist = ((ComplexEditVDSVectorLayer)layer).getGeometriestagList();
        if(geometriestaglist != null)
        {
            for(final String tag : geometriestaglist)
            {
            	Boolean statusCheckBoolean = ((ComplexEditVDSVectorLayer)layer).getGeometriesDisplay(tag);// ? "On" : "Off";
                //Boolean statusCheckBoolean = new Boolean(status.equalsIgnoreCase("On"));
                
                debugTableModel.addRow(new Object[]{tag, statusCheckBoolean});
                
            };
            debugTableModel.addTableModelListener(new TableModelListener() {
                public void tableChanged(TableModelEvent e) {
                    int selectedrow = flagTable.getSelectedRow();
                    if((selectedrow != -1) && (selectedrow < flagTable.getRowCount()))
                    {
                        boolean status = ((Boolean)flagTable.getValueAt(selectedrow, 1));
                        String tag = ((String)flagTable.getValueAt(selectedrow, 0));
                        ((ComplexEditVDSVectorLayer)layer).toggleGeometriesByTag(tag, status);
                        repaint();
                    }
                }
            });
        }
        flagTable.setModel(debugTableModel);
        flagTable.setName("jTable2"); // NOI18N
        jScrollPaneCheckboxFlag.setViewportView(flagTable);

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTableData, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPaneCheckboxFlag, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPaneTableData, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addContainerGap()
                    .addComponent(jScrollPaneCheckboxFlag, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addContainerGap())
        );
    }
    
   /// key listener implementation
    
    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    	FlagTable t=(FlagTable)e.getSource();
        switch(e.getKeyCode())
        {
        	
            // toggle the display of the additional geometries
            case 'D':
            case 'd':
            {
                display = !display;
                ((GeometricInteractiveVDSLayerModel)t.getModel()).changeSelection(t.getSelectedRow(), display);
            } break;
            // toggle bands
            case 'B':
            case 'b':
            {
                Platform.getConsoleLayer().execute("bs");
            } break;
            // increase the contrast
            case KeyEvent.VK_C:
            {
                if(e.isShiftDown())
                    Platform.getConsoleLayer().execute("contrast +10");
                else
                    Platform.getConsoleLayer().execute("contrast -10");
            } break;
            // move image up
            case KeyEvent.VK_UP:
            {
                if(e.isAltDown())
                    Platform.getGeoContext().setY(Platform.getGeoContext().getY() - Platform.getGeoContext().getHeight() / 3);
            } break;
            // move image down
            case KeyEvent.VK_DOWN:
            {
                if(e.isAltDown())
                    Platform.getGeoContext().setY(Platform.getGeoContext().getY() + Platform.getGeoContext().getHeight() / 3);
            } break;
            // move image left
            case KeyEvent.VK_LEFT:
            {
                if(e.isAltDown())
                    Platform.getGeoContext().setX(Platform.getGeoContext().getX() - Platform.getGeoContext().getWidth() / 3);
            } break;
            // move image right
            case KeyEvent.VK_RIGHT:
            {
                if(e.isAltDown())
                    Platform.getGeoContext().setX(Platform.getGeoContext().getX() + Platform.getGeoContext().getWidth() / 3);
            } break;
            // zoom out image
            case KeyEvent.VK_Z:
            {	//undo operation
            	if (e.isControlDown()){  
            		if(deleted.size()>0){
            			Geometry geom=deleted.remove(0);
            			AttributesGeometry attr=attrDeleted.remove(0);
            			GeometricLayer gl=((ComplexEditVDSVectorLayer)layer).getGeometriclayer();
            			gl.put(geom,attr);
            			((ComplexEditVDSVectorLayer)layer).setSelectedGeometry(geom);
            			glm.fireTableDataChanged();
            		}	
            		
            	}else{
                    OpenGLContext geoContext = Platform.getGeoContext();
                    float zoom = (float) geoContext.getZoom();
                    if(e.isShiftDown())
                    {
                        zoom = zoom * 2;
                    } else {
                        zoom = zoom / 2;
                    }
                    int x = (int) (geoContext.getX() + geoContext.getWidth() * geoContext.getZoom() / 2);
                    int y = (int) (geoContext.getY() + geoContext.getHeight() * geoContext.getZoom() / 2);
                    geoContext.setZoom(zoom);
                    geoContext.setX((int) (x - geoContext.getWidth() * zoom / 2));
                    geoContext.setY((int) (y - geoContext.getHeight() * zoom / 2));
            	}    
            } break;
            // toggle the display of Azimuth rulers
            case KeyEvent.VK_A:
            {
                ((GeometricInteractiveVDSLayerModel)t.getModel()).toggleRulers(t.getSelectedRow());
            } break;
            case 'E':
            case 'e':
            {
               ((GeometricInteractiveVDSLayerModel)t.getModel()).editSelection(t.getSelectedRow());
            } break;
            default:
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
    	FlagTable t=(FlagTable)e.getSource();
        int id = e.getID();
        if(id == e.KEY_RELEASED && e.getKeyChar() == e.VK_BACK_SPACE)
        {
            if(t.getSelectedRow() != -1)
                for(int i:t.getSelectedRows()){
                	GeometricLayer gl=((ComplexEditVDSVectorLayer)layer).getGeometriclayer();
                	Geometry geom=gl.getGeometries().get(i);
                	deleted.add(0,geom);
                    attrDeleted.add(0,(gl).getAttributes(geom));
                	((GeometricInteractiveVDSLayerModel)t.getModel()).removeSelection(i);
                	glm.fireTableDataChanged();
                	if(gl.getGeometries().size()>0){
                		int sel=0;
                		if(i>0&&i<(gl.getGeometries().size()-1))
                			sel=i;
                		((GeometricInteractiveVDSLayerModel)t.getModel()).changeSelection(sel, display);
                		glm.changeSelection(sel, true);
                		((JTable)e.getSource()).setRowSelectionInterval(sel,sel);
                	}
                }
            this.repaint();
            ((GeometricInteractiveVDSLayerModel)t.getModel()).changeSelection(t.getSelectedRow(), display);
        }
    }

}
