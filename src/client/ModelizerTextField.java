package client;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static client.HttpVerb.*;
import static client.HttpVerb.DELETE;

/**
 * Created by erikrahtjen on 9/26/16.
 */
public class ModelizerTextField implements ActionListener, Registerable<OnClickListener<ModelizerTextField>> {

    private JTextField httpRouteField;
    private JComboBox<HttpVerb> httpVerbComboBox;
    private JPanel rootPanel;
    private JButton sendRequestButton;
    private OnClickListener<ModelizerTextField> clickListener;

    public ModelizerTextField() {
        super();
        httpVerbComboBox.addItem(GET);
        httpVerbComboBox.addItem(POST);
        httpVerbComboBox.addItem(PUT);
        httpVerbComboBox.addItem(PATCH);
        httpVerbComboBox.addItem(DELETE);

        GhostText ghostText = new GhostText(httpRouteField, "https://yourapi.com/exampleroute");
        ghostText.setGhostColor(httpRouteField.getDisabledTextColor());

        sendRequestButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (clickListener != null) {
            clickListener.onClick(this);
        }
    }

    public HttpVerb getHttpMethod() {
        return (HttpVerb) httpVerbComboBox.getSelectedItem();
    }

    public String getHttpRoute() {
        return httpRouteField.getText();
    }

    @Override
    public void register(OnClickListener<ModelizerTextField> registrant) {
        this.clickListener = registrant;
    }

    @Override
    public void deregister() {
        this.clickListener = null;
    }
}
