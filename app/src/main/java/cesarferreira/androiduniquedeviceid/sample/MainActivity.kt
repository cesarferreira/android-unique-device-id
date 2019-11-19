package cesarferreira.androiduniquedeviceid.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cesarferreira.androiduniquedeviceid.DeviceUniqueKeyGenerator
import cesarferreira.androiduniquedeviceid.sample.R
import kotlinx.android.synthetic.main.activity_main.textView
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val deviceUniqueKeyGenerator by inject<DeviceUniqueKeyGenerator>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = deviceUniqueKeyGenerator.getUniqueId()
    }
}
