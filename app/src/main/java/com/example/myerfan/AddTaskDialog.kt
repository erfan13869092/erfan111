package com.example.myerfan

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.myerfan.databinding.DialogAddTaskBinding

class AddTaskDialog(val nameTask: (String) -> Unit) : DialogFragment() {
    private var _binding: DialogAddTaskBinding? = null
    private val binding get() = _binding!!
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())
        _binding = DialogAddTaskBinding.inflate(layoutInflater)
        builder.setView(binding.root)
        onClick()
        isCancelable = false
        return builder.create()

    }

    private fun onClick() {
        binding.btnDialogAddTaskOk.setOnClickListener {
            val nameTaskString = binding.etDialogAddTaskNameTask.text.toString()
            nameTask(nameTaskString)
            dismiss()
        }
        binding.btnDialogAddTaskCancel.setOnClickListener {
            dismiss()
        }
    }
}