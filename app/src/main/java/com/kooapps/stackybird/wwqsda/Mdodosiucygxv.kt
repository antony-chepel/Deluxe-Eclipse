package com.kooapps.stackybird.wwqsda
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import android.content.SharedPreferences
import android.view.View
import androidx.fragment.app.Fragment
import org.koin.core.qualifier.named
import android.view.LayoutInflater
import android.os.Bundle
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import android.content.Context
import com.kooapps.stackybird.R
import com.kooapps.stackybird.bvicijjicf.Opsiwuhsd
import com.kooapps.stackybird.hgfbdf.Mksoixuchhssa
import com.kooapps.stackybird.hgfbdf.Mksoixuchhssa.dplelpwp
import com.kooapps.stackybird.hgfbdf.Mksoixuchhssa.hcxhuhuvhudjisjifji


class Mdodosiucygxv : Fragment() {
    val apaplpsplpllxcl by activityViewModel<Opsiwuhsd>(named("MainModel"))
    lateinit var tokrkokoeokkokof: String
    lateinit var icuxhvhuijd: String
    lateinit var gcvijd: String
    val oowkkowko: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var dplflpeeflp: Context


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.goofkdokejiwasd, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        apaplpsplpllxcl.dekokwokooksd.observe(viewLifecycleOwner) {
            if (it != null) {
                val vnvkicjjicxji = it.toString()
                oowkkowko.edit().putString("mainId", vnvkicjjicxji).apply()
            }
        }

        apaplpsplpllxcl.oktokkokokoeko.observe(viewLifecycleOwner) {
            if (it != null) {

                gcvijd = it.gvhyicjfodkf
                icuxhvhuijd = it.bhvikockovko
                tokrkokoeokkokof = it.eplpqllps

                oowkkowko.edit().putString(hcxhuhuvhudjisjifji, gcvijd).apply()
                oowkkowko.edit().putString(Mksoixuchhssa.hbhvjijijcv, icuxhvhuijd).apply()
                oowkkowko.edit().putString(dplelpwp, tokrkokoeokkokof).apply()

                findNavController().navigate(R.id.apsokxkocjuchhuv)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        dplflpeeflp = context
    }

}