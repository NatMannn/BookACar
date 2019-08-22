package buu.informatics.s59160953.bookacar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var id_1 = ""
    var brand_1 = ""
    var name_1 = ""

    var id_2 = ""
    var brand_2 = ""
    var name_2 = ""

    var id_3 = ""
    var brand_3 = ""
    var name_3 = ""

    var num = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    if(id_1 == "" && id_2 == "" && id_3 == "") {
        slot1_button.setText("FREE")
        slot2_button.setText("FREE")
        slot3_button.setText("FREE")
    } else {
        slot1_button.setText("FULL")
        slot2_button.setText("FULL")
        slot3_button.setText("FULL")
    }

        slot1_button.setOnClickListener(){
            num = 1
            ID_car_edit.setText(id_1)
            brand_edit.setText(brand_1)
            name_edit.setText(name_1)

        }
        slot2_button.setOnClickListener(){
            num = 2
            ID_car_edit.setText(id_2)
            brand_edit.setText(brand_2)
            name_edit.setText(name_2)

        }
        slot3_button.setOnClickListener(){
            num = 3
            ID_car_edit.setText(id_3)
            brand_edit.setText(brand_3)
            name_edit.setText(name_3)

        }
        update_button.setOnClickListener() {
            if(num == 1) {
                id_1 = ID_car_edit.text.toString()
                brand_1 = brand_edit.text.toString()
                name_1 = name_edit.text.toString()

                if(id_1 != "" && brand_1 != "" && name_1 != ""){
                    slot1_button.setText("FULL")

                } else {
                    slot1_button.setText("FREE")
                }
            }

            else if (num == 2) {
                id_2 = ID_car_edit.text.toString()
                brand_2 = brand_edit.text.toString()
                name_2 = name_edit.text.toString()

                if(id_2 != "" && brand_2 != "" && name_2 != ""){
                    slot2_button.setText("FULL")
                } else {
                    slot2_button.setText("FREE")
                }
            }

            else if (num == 3) {
                id_3 = ID_car_edit.text.toString()
                brand_3 = brand_edit.text.toString()
                name_3 = name_edit.text.toString()

                if(id_3 != "" && brand_3 != "" && name_3 != ""){
                    slot3_button.setText("FULL")
                } else {
                    slot3_button.setText("FREE")
                }
            }
        }
        delete_button.setOnClickListener() {
            DeleleButton()
        }

    }
    fun DeleleButton() {
        if(num == 1 ) {
            ID_car_edit.setText("")
            brand_edit.setText("")
            name_edit.setText("")

            id_1= ""
            brand_1 = ""
            name_1 = ""

            slot1_button.setText("FREE")
        }

        else if(num == 2 ) {
            ID_car_edit.setText("")
            brand_edit.setText("")
            name_edit.setText("")

            id_2= ""
            brand_2 = ""
            name_2 = ""

            slot2_button.setText("FREE")
        }

        else if(num == 3 ) {
            ID_car_edit.setText("")
            brand_edit.setText("")
            name_edit.setText("")

            id_3= ""
            brand_3 = ""
            name_3 = ""

            slot3_button.setText("FREE")
        }
    }

}
