package com.example.newproject20jan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"




class NewsFragment : Fragment() {


    private lateinit var adapter: NewAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var newsArrayList: ArrayList<News>


    private lateinit var newsHead:ArrayList<String>



    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NewsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NewsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showData()

        val LayoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LayoutManager
        recyclerView.setHasFixedSize(true)
        adapter = NewAdapter(newsArrayList)
        recyclerView.adapter = adapter
    }

    private fun showData(){
        newsArrayList = arrayListOf()

        var  img = arrayOf( R.drawable.star,
            R.drawable.img,
            R.drawable.star,
            R.drawable.img,
            R.drawable.star,
            R.drawable.img,
            R.drawable.star,
            R.drawable.img,
            R.drawable.star,
            R.drawable.img,
        )



        var title = arrayOf("today news is SatwinderGood News",
            "today news is SatwinderGood ",
            "today news is Satwinder News",
            "today news  SatwinderGood News",
            "today  is SatwinderGood News",
            "today news is SatwinderGood News",
            "news is SatwinderGood News",
            "today SatwinderGood News",
            "today news is  News",
        )
        var newsHead = arrayOf("today news is SatwinderGood News",
            "today news is SatwinderGood ",
            "today news is Satwinder News",
            "today news  SatwinderGood News",
            "today  is SatwinderGood News",
            "today news is SatwinderGood News",
            "news is SatwinderGood News",
            "today SatwinderGood News",
            "today news is  News",
        )
      for(i in img.indices){
          val news = News(img[i], title[i],newsHead[i])
          newsArrayList.add(news)
      }


    }
}