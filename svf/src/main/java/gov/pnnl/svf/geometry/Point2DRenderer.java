package gov.pnnl.svf.geometry;

import com.jogamp.opengl.GL2;
import gov.pnnl.svf.core.geometry.Border;
import gov.pnnl.svf.scene.Scene;
import gov.pnnl.svf.util.Border2DUtil;
import gov.pnnl.svf.util.Shape2DUtil;

/**
 * Shape renderer implementation.
 *
 * @author Amelia Bleeker
 */
public class Point2DRenderer extends AbstractShapeRenderer {

    /**
     * Constructor
     *
     * @param scene reference to the scene
     */
    public Point2DRenderer(final Scene scene) {
        super(scene);
    }

    @Override
    public int drawShape(final GL2 gl, final Shape shape) {
        if (shape instanceof Point2D) {
            return Shape2DUtil.drawShape(gl, (Point2D) shape);
        }
        return 0;
    }

    @Override
    public int drawBorder(final GL2 gl, final Shape shape, final Border border, final double thickness) {
        if (shape instanceof Point2D) {
            return Border2DUtil.drawBorder(gl, (Point2D) shape, border, thickness);
        }
        return 0;
    }

}
