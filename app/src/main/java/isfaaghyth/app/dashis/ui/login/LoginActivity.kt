package isfaaghyth.app.dashis.ui.login

import android.content.Intent
import android.widget.Button
import android.widget.EditText
import isfaaghyth.app.dashis.R
import isfaaghyth.app.dashis.base.BaseActivity
import isfaaghyth.app.dashis.data.model.StudentAuth
import isfaaghyth.app.dashis.ui.main.MainActivity
import org.koin.android.ext.android.inject

class LoginActivity : BaseActivity<LoginPresenter>(), LoginActivityView {

    private val presenter by inject<LoginPresenter>()
    override fun presenter(): LoginPresenter = presenter
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
