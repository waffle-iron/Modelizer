package modelizer;

import org.fife.ui.rsyntaxtextarea.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;


/**
 * Created by erikrahtjen on 9/27/16.
 */
public class ModelizerToolWindow implements ModelizerPresenter.View, OnClickListener<ModelizerTextField> {

    /*
        UI Objects
         */
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private ModelizerTextField httpTextField;
    private RSyntaxTextArea responseBodyEditorPane;
    private JPanel responsePanel;

    /*
    Logic Objects
     */
    private final ModelizerPresenter presenter;

    public ModelizerToolWindow() {
        responseBodyEditorPane.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JSON);
        responseBodyEditorPane.setBackground(responsePanel.getBackground());
        responseBodyEditorPane.setForeground(Color.WHITE);
        responseBodyEditorPane.getSyntaxScheme().getStyle(TokenTypes.LITERAL_NUMBER_DECIMAL_INT).foreground = Color.CYAN;

        httpTextField.register(this);
        presenter = new ModelizerPresenter(this);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    @Override
    public void onClick(ModelizerTextField clicked) {
        System.out.println("onClick");
        presenter.sendRequest(clicked.getHttpMethod(), clicked.getHttpRoute());
    }

    @Override
    public void displayBody(String s) {
        responseBodyEditorPane.setText(s);
    }
}
