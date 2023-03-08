package com.kooapps.stackybird.asd
import android.view.LayoutInflater
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.android.ext.android.inject
import android.content.SharedPreferences
import androidx.navigation.fragment.findNavController
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.ViewGroup
import org.koin.core.qualifier.named
import android.content.Context
import android.view.View
import com.kooapps.stackybird.R
import com.kooapps.stackybird.bvicijjicf.Opsiwuhsd
import com.kooapps.stackybird.hgfbdf.Mksoixuchhssa.tplrleppepwwepsda


class Qioiwjsiokc : Fragment() {
    lateinit var jijicvjijjsduh: String
    val sdlplpwpookdsaji: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var rplelplpwpllpsda: Context
    val ycxtvdhusf by activityViewModel<Opsiwuhsd>(named("MainModel"))






    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ycxtvdhusf.fokrokeple.observe(viewLifecycleOwner) {
            if (it!=null) {
                jijicvjijjsduh = it.ncvuhbhufd
                sdlplpwpookdsaji.edit().putString(tplrleppepwwepsda, jijicvjijjsduh).apply()
                findNavController().navigate(R.id.cuuxjvjujudjs)
            }
        }
    }





    override fun onAttach(context: Context) {
        super.onAttach(context)
        rplelplpwpllpsda = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bhvcijjijisf, container, false)
    }








}