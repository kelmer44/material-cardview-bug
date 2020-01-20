package net.kelmer.android.materialcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_cardview.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val behavior = BottomSheetBehavior.from(bottom_sheet).apply {
            state = BottomSheetBehavior.STATE_HIDDEN
        }
        button_opensheet.setOnClickListener {
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
        }


        show_layer_button.setOnClickListener {
            test_layer.isVisible = !test_layer.isVisible
        }


        card_overlap_button.setOnClickListener {
            card_view.preventCornerOverlap = !card_view.preventCornerOverlap
        }

    }
}
