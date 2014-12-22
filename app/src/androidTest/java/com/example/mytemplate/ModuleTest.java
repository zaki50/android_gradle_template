
package com.example.mytemplate;

import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import dagger.Module;
import dagger.ObjectGraph;
import dagger.Provides;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class ModuleTest {

    @Module(injects = ModuleTest.class)
    static final class MyModule {

        @Provides
        SampleModel provideSampleModel() {
            return new SampleModel();
        }
    }

    @Inject
    SampleModel mSampleModel;

    @Before
    public void setUp() throws Exception {
        ObjectGraph.create(new MyModule())
                   .inject(this);
    }

    @Test
    public void testThatDependencyIsInjected() {
        assertThat(mSampleModel, is(notNullValue()));
    }
}
