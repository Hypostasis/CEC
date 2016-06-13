package cec.test;

import cec.cluster.Point;
import cec.input.DataReader;
import cec.input.ImageReader;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.List;

/**
 * Created by pawel on 5/29/16.
 */
public class ImageReaderTest extends TestCase {
    public void testRead() throws Exception {
        DataReader imageReader = new ImageReader();
        List<Point> list = imageReader.read("src/main/resources/data/plus.png", "image/png");
        assert list.size() == 56;
    }

    public void testReadTIFF() throws Exception {
        DataReader imageReader = new ImageReader();
        List<Point> list = imageReader.read("src/main/resources/data/example.tiff", "image/tiff");
        assertEquals(list.size(), 93902);
    }
}