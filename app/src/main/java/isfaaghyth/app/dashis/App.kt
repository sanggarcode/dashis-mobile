package isfaaghyth.app.dashis

import android.app.Application
import isfaaghyth.app.dashis.di.activityModule
import isfaaghyth.app.dashis.di.repositoryModule
import org.koin.android.ext.android.startKoin

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(
                repositoryModule,
                activityModule))
    }

}