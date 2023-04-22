package com.asifrezan.uitest.fregments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asifrezan.uitest.MainActivity
import com.asifrezan.uitest.R
import com.asifrezan.uitest.activities.WelcomeActivity


class StartMainActivityHelperFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(requireContext(), MainActivity::class.java)
        startActivity(intent)


//        val StartTimer = object : Thread() {
//            override fun run() {
//                try {
//                    sleep(2000)
//
//                } catch (e: InterruptedException) {
//                    e.printStackTrace()
//
//                } finally {
//
//
//                }
//            }
//        }
//        StartTimer.start()


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


//        val StartTimer = object : Thread() {
//            override fun run() {
//                try {
//                    sleep(2000)
//
//                } catch (e: InterruptedException) {
//                    e.printStackTrace()
//
//                } finally {
//
//
//                }
//            }
//        }
//        StartTimer.start()





        return inflater.inflate(R.layout.fragment_start_main_activity_helper, container, false)
    }
}