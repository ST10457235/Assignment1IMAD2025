@file:Suppress("SpellCheckingInspection", "SpellCheckingInspection")

package vcmsa.ci.mealsuggestionsapp

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@Suppress("SpellCheckingInspection", "SpellCheckingInspection")
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("vcmsa.ci.mealsuggestionsapp", appContext.packageName)
    }
}