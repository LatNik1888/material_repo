package ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.material_kt.R
import kotlinx.android.synthetic.main.settings_fragment.*
import ui.POD.PictureOfTheDayFragment



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PictureOfTheDayFragment.newInstance())
                .commitNow()
        }

        raisedButton.setOnClickListener{
            setTheme(R.style.Custom_Material_kt)
            recreate()
        }
    }


}