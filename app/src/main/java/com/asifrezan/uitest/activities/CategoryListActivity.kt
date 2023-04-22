package com.asifrezan.uitest.activities

import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.asifrezan.uitest.R
import com.asifrezan.uitest.adapter.ProductGridAdapter
import com.asifrezan.uitest.data.CategoryData
import com.asifrezan.uitest.data.ProductData

class CategoryListActivity : AppCompatActivity() {

    lateinit var productGridView: GridView
    lateinit var productList : List<ProductData>
    lateinit var total_product : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_list)
        val title = intent.getStringExtra("title")
        val textView = findViewById<TextView>(R.id.textView).setText(title)

        productGridView = findViewById(R.id.gridViewId)


        productList = listOf(
            ProductData("Broccoli flower",100.00,60.00,R.drawable.broccoli),
            ProductData("Pomegranate",300.00,250.00,R.drawable.pomegranate),
            ProductData("Green Apple",200.00,160.00,R.drawable.green_apple),
            ProductData("Green capsicum",160.00,150.00,R.drawable.green_capsicum),
            ProductData("Pomegranate",200.00,160.00,R.drawable.pomegranate),
            ProductData("Broccoli flower",100.00,60.00,R.drawable.broccoli),
            ProductData("Pomegranate",300.00,250.00,R.drawable.pomegranate),
            ProductData("Green Apple",200.00,160.00,R.drawable.green_apple),
            ProductData("Green capsicum",160.00,150.00,R.drawable.green_capsicum),
            ProductData("Pomegranate",200.00,160.00,R.drawable.pomegranate),

            )

         var count_product = productList.size

        total_product = findViewById(R.id.total_product)

        total_product.setText("$count_product Products Found")








        val productAdapter = ProductGridAdapter(productList = productList, this@CategoryListActivity)

        productGridView.adapter = productAdapter





    }
}