package com.example.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rockpaperscissors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rockButton.setOnClickListener { getComputerChoice()
        rock()
        }
        binding.paperButton.setOnClickListener {getComputerChoice()
        paper()
        }
        binding.scissorsButton.setOnClickListener {getComputerChoice()
        scissors()
        }
    }

    val options = listOf("Rock", "Paper", "Scissors")


    fun getComputerChoice(): String {
        val a = (Math.random() * options.size).toInt()
        return options[a]
    }
    fun rock() {
        when (getComputerChoice()) {
            options[0] -> { binding.whatIChoseAndWhatTheComputerChose.setText(R.string.what_we_chose_for_rock_I)
                binding.result.setText(R.string.tie)
            }
            options[1] -> { binding.whatIChoseAndWhatTheComputerChose.setText(R.string.what_we_chose_for_rock_II)
                binding.result.setText(R.string.lose)
            }
            options[2] -> { binding.whatIChoseAndWhatTheComputerChose.setText(R.string.what_we_chose_for_rock_III)
                binding.result.setText(R.string.win)
            }

        }
    }
    fun paper() {
        when (getComputerChoice()) {
            options[0] -> { binding.whatIChoseAndWhatTheComputerChose.setText(R.string.what_we_chose_for_paper_I)
                binding.result.setText(R.string.win)}
            options[1] -> { binding.whatIChoseAndWhatTheComputerChose.setText(R.string.what_we_chose_for_paper_II)
                binding.result.setText(R.string.tie)
            }
            options[2] -> { binding.whatIChoseAndWhatTheComputerChose.setText(R.string.what_we_chose_for_paper_III)
                binding.result.setText(R.string.lose)
            }
        }
    }
    fun scissors(){
        when (getComputerChoice()) {
            options[0] -> { binding.whatIChoseAndWhatTheComputerChose.setText(R.string.what_we_chose_for_scissors_I)
                binding.result.setText(R.string.lose)
            }
            options[1] -> { binding.whatIChoseAndWhatTheComputerChose.setText(R.string.what_we_chose_for_scissors_II)
                binding.result.setText(R.string.win)
            }
            options[2] -> { binding.whatIChoseAndWhatTheComputerChose.setText(R.string.what_we_chose_for_scissors_III)
                binding.result.setText(R.string.tie)
            }

        }
    }

}