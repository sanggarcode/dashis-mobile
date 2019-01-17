package isfaaghyth.app.dashis.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import isfaaghyth.app.dashis.R
import isfaaghyth.app.dashis.data.model.Insis

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
open class InsisAdapter(val insisses: List<Insis>): RecyclerView.Adapter<InsisAdapter.InsisHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): InsisHolder {
        val holder = InsisHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_insis, p0,false))
        holder.itemView.setOnClickListener {

        }
        return holder
    }

    override fun onBindViewHolder(p0: InsisHolder, p1: Int) {
        val insis = insisses[p1]
        p0.setData(insis)
    }

    override fun getItemCount(): Int = insisses.size

    class InsisHolder(val view: View): RecyclerView.ViewHolder(view) {
        val txtTitle = view.findViewById<TextView>(R.id.txtTitle)
        val txtValue = view.findViewById<TextView>(R.id.txtValue)

        fun setData(insis: Insis) {
            txtTitle.text = insis.title
            txtValue.text = insis.value.toString()
        }
    }

}