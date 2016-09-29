package modelizer;

import javax.swing.*;
import javax.swing.text.*;
import java.io.*;

/**
 * Created by erikrahtjen on 9/27/16.
 */
public class JSONEditorKit extends EditorKit {
    @Override
    public String getContentType() {
        return "text/json";
    }

    @Override
    public ViewFactory getViewFactory() {
        return null;
    }

    @Override
    public Action[] getActions() {
        return new Action[0];
    }

    @Override
    public Caret createCaret() {
        return null;
    }

    @Override
    public Document createDefaultDocument() {
        return null;
    }

    @Override
    public void read(InputStream in, Document doc, int pos) throws IOException, BadLocationException {

    }

    @Override
    public void write(OutputStream out, Document doc, int pos, int len) throws IOException, BadLocationException {

    }

    @Override
    public void read(Reader in, Document doc, int pos) throws IOException, BadLocationException {

    }

    @Override
    public void write(Writer out, Document doc, int pos, int len) throws IOException, BadLocationException {

    }
}
