package htmlpublisher;

import hudson.FilePath;
import hudson.model.*;

public abstract class AbstractHtmlPublisherTarget extends AbstractDescribableImpl<AbstractHtmlPublisherTarget> {

    @Override
    public AbstractHtmlPublisherTargetDescriptor getDescriptor() {
        return (AbstractHtmlPublisherTargetDescriptor) super.getDescriptor();
    }

    public abstract boolean getKeepAll();

    public abstract boolean getAllowMissing();

    public abstract FilePath getArchiveTarget(Run<?, ?> build);

    public abstract String getReportFiles();

    public abstract String getReportTitles();

    public abstract String getReportDir();

    public abstract String getSanitizedName();

    public abstract String getIncludes();

    public abstract void handleAction(Run<?, ?> build, String checksum);

    public abstract String getWrapperName();

    public abstract Action getProjectAction(AbstractItem project);
}
