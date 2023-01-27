package com.l3git.marinesrankstest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.l3git.marinesrankstest.databinding.ActivityResultBinding



class ResultActivity : AppCompatActivity() {

    private var _binding: ActivityResultBinding? = null
    private val binding get() = _binding!!

    var mCurrentPosition: Int = 1
    var mFactsList: ArrayList<Fact>? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mFactsList = Constants.getFacts()

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        binding.tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"


        binding.btnFinish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        binding.btnNextFact.setOnClickListener {
            setFact()
        }
    }

    fun setFact(){
        val fact = mFactsList!![mCurrentPosition - 1]

        if (mCurrentPosition == mFactsList!!.size){
            binding.btnNextFact.text = "Start Over"
            mCurrentPosition = 1

        }else{
            binding.btnNextFact.text = "Next Fact"
            mCurrentPosition++
        }

        binding.tvFact.text = fact.fact
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}