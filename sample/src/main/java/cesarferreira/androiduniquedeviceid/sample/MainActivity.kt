package cesarferreira.androiduniquedeviceid.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cesarferreira.androiduniquedeviceid.UniqueDeviceIdProvider
import kotlinx.android.synthetic.main.activity_main.textView
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val idProvider by inject<UniqueDeviceIdProvider>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = idProvider.getUniqueId()
    }
}
