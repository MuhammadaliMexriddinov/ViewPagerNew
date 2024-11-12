package uz.gita.homeworkviewpagertask1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class PageViewPager : Fragment(R.layout.page_task) {

    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val pos = requireArguments().getInt("POS")
        val img = view.findViewById<ImageView>(R.id.image)


        when (pos) {
            0 ->{
                img.setImageResource(R.drawable.ic_bottom_history)
               view.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.page0))
                requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.page0)

            }

            1->{
                 img.setImageResource(R.drawable.ic_bottom_main)
                view.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.page1))
                requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.page1)

            }

            else->{
                 img.setImageResource(R.drawable.ic_bottom_payment)
                view.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.page2))
                requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.page2)


            }
        }
    }

}