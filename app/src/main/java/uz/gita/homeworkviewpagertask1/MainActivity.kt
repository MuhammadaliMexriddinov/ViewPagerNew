package uz.gita.homeworkviewpagertask1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.viewpager2.widget.ViewPager2
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import uz.gita.homeworkviewpagertask1.adapters.AdapterViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBack = findViewById<ImageView>(R.id.btnBack)
        val buttonAction = findViewById<ImageView>(R.id.btnNext)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val adapter = AdapterViewPager(this)
        viewPager.adapter = adapter

        val dots = findViewById<WormDotsIndicator>(R.id.worm_dots_indicator)
        dots.attachTo(viewPager)

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
//                Toast.makeText(this@MainActivity, "POSITION = $position", Toast.LENGTH_SHORT).show()
                when (position) {
                    0 -> {
                        buttonBack.visibility = View.INVISIBLE
                    }
                    1 -> {
                        buttonBack.visibility = View.VISIBLE
                    }
                    else -> {git commit -m "first commit"

                        buttonBack.visibility = View.VISIBLE
                    }
                }
            }
        })

        buttonBack.setOnClickListener{
            viewPager.currentItem--
        }

        buttonAction.setOnClickListener {
            viewPager.currentItem++
        }

    }
}