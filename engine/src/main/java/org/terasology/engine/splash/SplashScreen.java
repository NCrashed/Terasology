/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.engine.splash;

/**
 * Provides access to a {@link SplashScreenCore} implementation.
 * @author Martin Steiger
 */
public final class SplashScreen {

    private static final SplashScreenCore INSTANCE = (java.awt.SplashScreen.getSplashScreen() != null)
            ? new SplashScreenImpl()
            : new SplashScreenStub();

    private SplashScreen() {
        // no instances!
    }

    /**
     * @return a valid instance of a splash screen. Never <code>null</code>.
     */
    public static SplashScreenCore getInstance() {
        return INSTANCE;
    }
}
