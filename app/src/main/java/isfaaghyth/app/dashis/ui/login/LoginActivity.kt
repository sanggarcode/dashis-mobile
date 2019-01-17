package isfaaghyth.app.dashis.ui.login

import android.content.Intent
import android.widget.Button
import android.widget.EditText
import isfaaghyth.app.dashis.R
import isfaaghyth.app.dashis.base.BaseActivity
import isfaaghyth.app.dashis.data.DataManager
import isfaaghyth.app.dashis.data.model.StudentAuth
import isfaaghyth.app.dashis.ui.main.MainActivity

class LoginActivity : BaseActivity<LoginPresenter>(), LoginActivityView {

    private val dataManager = DataManager()

    override fun presenter(): LoginPresenter = LoginPresenter(dataManager)
    override fun contentView(): Int = R.layout.activity_login

    override fun onCreated() {
        presenter().attachView(this)

        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()
            presenter().login(email, password)
        }
    }

    override fun onLoginSuccess(result: StudentAuth) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("uuid", result.student.uuid)
        intent.putExtra("token", result.token)
        startActivity(intent)
        finish()
    }

}
