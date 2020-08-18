package fullpagedeveloper.com.viewpager2withnavigationcomponent.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import fullpagedeveloper.com.viewpager2withnavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_screen_second.view.*
import kotlinx.android.synthetic.main.fragment_third_screen.view.*

class SecondScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_screen_second, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager2)

        view.textView_Next.setOnClickListener {
            viewPager?.currentItem = 2
        }

        return view
    }

}