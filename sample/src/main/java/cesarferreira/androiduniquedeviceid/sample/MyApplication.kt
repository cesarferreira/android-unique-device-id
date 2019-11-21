package cesarferreira.androiduniquedeviceid.sample

import android.app.Application
import cesarferreira.androiduniquedeviceid.UniqueDeviceIdProvider
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(module {
                single { UniqueDeviceIdProvider(get()) }
            })
        }
    }
}