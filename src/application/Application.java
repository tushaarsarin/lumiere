package application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class Application {
    private JFrame frame;
    private DocumentPanel panel;

    public void addDocumentPanel(DocumentPanel newPanel) {
        Dimension dimension = new Dimension(GlobalSettings.getWidth(), GlobalSettings.getHeight());
        this.panel = newPanel;
        this.panel.setPreferredSize(dimension);
        this.panel.setFocusable(true);
        this.panel.requestFocusInWindow();
    }

    public void addKeyListener(KeyListener keyListener) {
        this.panel.addKeyListener(keyListener);
    }

    public void update() {
        try {
            SwingUtilities.invokeLater(() -> {
                // TODO: add future render methods
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
