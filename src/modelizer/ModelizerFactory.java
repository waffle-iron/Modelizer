package modelizer;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by erikrahtjen on 9/26/16.
 */
public class ModelizerFactory implements ToolWindowFactory {
    private ToolWindow toolWindow;
    private JPanel toolWindowContent;

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        this.toolWindow = toolWindow;

        ModelizerToolWindow clientForm = new ModelizerToolWindow();
        toolWindowContent = clientForm.getMainPanel();

        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(toolWindowContent, "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
