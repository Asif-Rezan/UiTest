package com.asifrezan.uitest.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.asifrezan.uitest.R
import com.asifrezan.uitest.data.ProductData
class ProductGridAdapter(
    private val productList: List<ProductData>,
    private val context: Context
) : BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null
    private var count = 0

    override fun getCount(): Int {
        return productList.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    @SuppressLint("SetTextI18n")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        val viewHolder: ViewHolder

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.product, parent, false)
            viewHolder = ViewHolder(convertView)
            convertView.tag = viewHolder
        } else {
            viewHolder = convertView.tag as ViewHolder
        }

        val productData = productList[position]
        viewHolder.productTitle.text = productData.productName
        viewHolder.productImage.setImageResource(productData.img_res)
        viewHolder.oldPrice.text = productData.old_price.toString()
        viewHolder.price.text = "৳"+productData.price.toString()


        viewHolder.addCartBtn.setOnClickListener(View.OnClickListener {
            viewHolder.addCartBtn.visibility = View.GONE
            viewHolder.addCartCount.visibility = View.VISIBLE
        })

        viewHolder.addButton.setOnClickListener(View.OnClickListener {

            count += 1

            viewHolder.countTextView.setText(""+count)

        })

        viewHolder.minusButton.setOnClickListener(View.OnClickListener {

            if(count>0)
            {
                count -= 1

            }

            viewHolder.countTextView.setText(""+count)

        })

        viewHolder.favouriteIcon.setOnClickListener(View.OnClickListener {


            viewHolder.favouriteIcon.setImageResource(R.drawable.green_heart)




        })



        return convertView!!
    }

    class ViewHolder(view: View) {
        val productTitle: TextView = view.findViewById(R.id.product_title)
        val productImage: ImageView = view.findViewById(R.id.product_image)
        val addCartBtn : TextView = view.findViewById(R.id.addCartButton)
        var addCartCount : ConstraintLayout = view.findViewById(R.id.add_cart_count)
        var price : TextView = view.findViewById(R.id.price)

        val addButton : ImageButton = view.findViewById(R.id.addimageButton)
        val minusButton : ImageButton = view.findViewById(R.id.minusImageButton)
        val countTextView : TextView = view.findViewById(R.id.countButton)

        val favouriteIcon : ImageView = view.findViewById(R.id.favouriteIcon)
        val oldPrice : TextView = view.findViewById(R.id.oldPrice)
    }
}
