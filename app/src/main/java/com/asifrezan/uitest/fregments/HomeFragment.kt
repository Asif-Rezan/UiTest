package com.asifrezan.uitest.fregments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.asifrezan.uitest.R
import com.asifrezan.uitest.activities.CategoryListActivity
import com.asifrezan.uitest.adapter.CategoryAdapter
import com.asifrezan.uitest.data.CategoryData


class HomeFragment : Fragment(),CategoryAdapter.OnItemClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CategoryAdapter
    private lateinit var categoryDataList: List<CategoryData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                requireActivity().finishAffinity()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(this, callback)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)


        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        recyclerView.setNestedScrollingEnabled(false);



//        val imageResIds = intArrayOf(
//            R.drawable.fruits_and_vegitables,
//            R.drawable.grocery_and_staples,
//            R.drawable.househould_needs,
//            R.drawable.mens_and_womens,
//            R.drawable.foot_ware
//        )

         categoryDataList = listOf(
            CategoryData("Fruits and Vegetables", "Lorem Ipsum is simply dummy text of the printing and typesetting industry", R.drawable.fruits_and_vegitables),
            CategoryData("Grocery and Staples", "Lorem Ipsum is simply dummy text of the printing and typesetting industry", R.drawable.grocery_and_staples),
            CategoryData("Household Needs", "Lorem Ipsum is simply dummy text of the printing and typesetting industry", R.drawable.househould_needs),
            CategoryData("Mans and Womens Wear", "Lorem Ipsum is simply dummy text of the printing and typesetting industry", R.drawable.mens_and_womens),
            CategoryData("Foot ware", "Lorem Ipsum is simply dummy text of the printing and typesetting industry", R.drawable.foot_ware),

        )

        adapter = CategoryAdapter(categoryDataList,this)
        recyclerView.adapter = adapter




        return view




    }

    override fun onItemClick(position: Int) {
        val clickedItem = categoryDataList[position]
        val intent = Intent(requireActivity(), CategoryListActivity::class.java)
        intent.putExtra("title", clickedItem.title)
        startActivity(intent)
    }


}