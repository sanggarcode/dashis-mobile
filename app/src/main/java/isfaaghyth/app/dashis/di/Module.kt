package isfaaghyth.app.dashis.di

import isfaaghyth.app.dashis.data.DataManager
import isfaaghyth.app.dashis.ui.login.LoginPresenter
import isfaaghyth.app.dashis.ui.main.MainPresenter
import org.koin.dsl.module.module

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */

val repositoryModule = module {
    single { DataManager() }
}

val activityModule = module {
    factory { MainPresenter(get()) }
    factory { LoginPresenter(get()) }
}