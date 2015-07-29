package org.freethemalloc.comman;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Harshana on 7/17/2015.
 */
public class LessonLayout {

    InputStream xml;
    Context context;
    public LessonLayout(Context context,InputStream file) {
        this.context = context;
        xml = file;

        Toast.makeText(context,""+file,Toast.LENGTH_SHORT).show();

        readXml();
    }

    private void init(){

    }

    private void readXml(){

        try {
            //Uri.parse("file:///android_asset/example.xml").;
            //File inputFile = new File(xml);
            SAXReader reader = new SAXReader();
            Document document = reader.read(xml);

            Toast.makeText(context, "Root element :"+ document.getRootElement().getName(), Toast.LENGTH_SHORT).show();

            Element classElement = document.getRootElement();

            List<Node> nodes = classElement.selectNodes("errors");
            System.out.println("----------------------------");
            for (Node node : nodes) {
                Log.d("TEST", "Current Element :" + node.getName());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
