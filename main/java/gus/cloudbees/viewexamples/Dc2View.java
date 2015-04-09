package gus.cloudbees.viewexamples;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;

import hudson.Extension;
import hudson.model.Item;
import hudson.model.TopLevelItem;
import hudson.model.Descriptor.FormException;
import hudson.model.ListView;
import hudson.model.View;
import hudson.model.ViewDescriptor;

public class Dc2View extends ListView {

    @DataBoundConstructor
    public Dc2View(String name) {
        super(name);
    }

    @Extension
    public static final class DescriptorImpl extends ViewDescriptor {
        public DescriptorImpl() {
            super(Dc2View.class);
        }

        @Override
        public String getDisplayName() {
            return "Dc2 View";
        }
    }
/*
    @Override
    public boolean contains(TopLevelItem arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Item doCreateItem(StaplerRequest arg0, StaplerResponse arg1)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<TopLevelItem> getItems() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected void submit(StaplerRequest arg0) throws IOException,
            ServletException, FormException {
        // TODO Auto-generated method stub

    }
*/
}
