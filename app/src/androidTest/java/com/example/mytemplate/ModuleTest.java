
package com.example.mytemplate;

import javax.inject.Inject;

import android.test.AndroidTestCase;
import dagger.Module;
import dagger.ObjectGraph;
import dagger.Provides;

import java.lang.AssertionError;

/**
 * Created by masui on 10/12/13.
 */
public class ModuleTest extends AndroidTestCase {

    @Module(injects = ModuleTest.class)
    static final class MyModule {

        @Provides
        SampleModel provideSampleModel() {
            return new SampleModel();
        }
    }

    @Inject
    SampleModel mSampleModel;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ObjectGraph.create(new MyModule())
                   .inject(this);
    }

    public void testThatDependencyIsInjected() {
        assertNotNull(mSampleModel);
    }
}
