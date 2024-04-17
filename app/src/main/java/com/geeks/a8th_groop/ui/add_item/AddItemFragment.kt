package com.geeks.a8th_groop.ui.add_item

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.geeks.a8th_groop.R
import com.geeks.a8th_groop.data.db.ShopEntity
import com.geeks.a8th_groop.databinding.FragmentAddItemBinding
import com.geeks.a8th_groop.utils.AppDB
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddItemFragment : Fragment() {

    private lateinit var binding: FragmentAddItemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddItemBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.btnAdd.setOnClickListener {
            if (binding.etName.text?.isNotEmpty() == true) {
                save()
            } else binding.etName.error = "Cannot be empty"

        }
    }

    private fun save() {
/*        val data = ShopEntity(
            name = binding.etName.text.toString(),
            desc = binding.etDesc.text.toString(),
            price = binding.etPrice.text.toString()
        )
        AppDB.db.shopDao().insert(data)*/
        binding.btnAdd.setOnClickListener {
            //findNavController().navigate(R.id.shopFragment)
            findNavController().navigateUp()
        }
    }

    companion object {
        const val TASK_RESULT_KEY = "task.result.key"
        const val TASK_KEY = "task.key"
    }
}