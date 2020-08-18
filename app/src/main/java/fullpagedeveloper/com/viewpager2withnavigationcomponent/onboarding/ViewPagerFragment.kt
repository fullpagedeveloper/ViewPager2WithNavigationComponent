package fullpagedeveloper.com.viewpager2withnavigationcomponent.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fullpagedeveloper.com.viewpager2withnavigationcomponent.R
import fullpagedeveloper.com.viewpager2withnavigationcomponent.onboarding.screen.FirtsScreenFragment
import fullpagedeveloper.com.viewpager2withnavigationcomponent.onboarding.screen.SecondScreenFragment
import fullpagedeveloper.com.viewpager2withnavigationcomponent.onboarding.screen.ThirdScreenFragment
import kotlinx.android.synthetic.main.fragment_view_pager.view.*


class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirtsScreenFragment(),
            SecondScreenFragment(),
            ThirdScreenFragment()
        )

        val adapter = ViewPagerAdapter(
            fragmentList, requireActivity().supportFragmentManager, lifecycle
        )

        view.viewPager2.adapter = adapter
        return view
    }

}