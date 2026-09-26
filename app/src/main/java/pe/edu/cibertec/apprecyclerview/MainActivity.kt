package pe.edu.cibertec.apprecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.cibertec.apprecyclerview.adapter.PersonajeAdapter
import pe.edu.cibertec.apprecyclerview.databinding.ActivityMainBinding
import pe.edu.cibertec.apprecyclerview.model.Personaje

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.rvcontactos.layoutManager = LinearLayoutManager(this)
        binding.rvcontactos.adapter = PersonajeAdapter(getPersonajes())
    }


    fun getPersonajes() : List<Personaje> {
        return listOf(
            Personaje(1, "Miguel Torres",
                "holaaaa", "18:52",
                "https://fastly.picsum.photos/id/200/300/300.jpg?hmac=aX7NyPgACwrm5XddShN5y4dyKI--2Wx_YFthk6YtBVc"),
            Personaje(2, "Julia Melendez",
                "holaaaa", "10:52",
                "https://fastly.picsum.photos/id/200/300/300.jpg?hmac=aX7NyPgACwrm5XddShN5y4dyKI--2Wx_YFthk6YtBVc"),
            Personaje(3, "Luis Perez",
                "holaaaa", "13:52",
                "https://fastly.picsum.photos/id/200/300/300.jpg?hmac=aX7NyPgACwrm5XddShN5y4dyKI--2Wx_YFthk6YtBVc"),
            Personaje(4, "Pedro Medrano",
                "holaaaa", "22:52",
                "https://fastly.picsum.photos/id/200/300/300.jpg?hmac=aX7NyPgACwrm5XddShN5y4dyKI--2Wx_YFthk6YtBVc"),
            Personaje(5, "Rafael Torres",
                "holaaaa", "15:52",
                "https://fastly.picsum.photos/id/200/300/300.jpg?hmac=aX7NyPgACwrm5XddShN5y4dyKI--2Wx_YFthk6YtBVc"),
            Personaje(6, "Miguel Huertas",
                "holaaaa", "12:52",
                "https://fastly.picsum.photos/id/200/300/300.jpg?hmac=aX7NyPgACwrm5XddShN5y4dyKI--2Wx_YFthk6YtBVc"),
            Personaje(1, "Miguel Torres",
                "holaaaa", "18:52",
                "https://fastly.picsum.photos/id/200/300/300.jpg?hmac=aX7NyPgACwrm5XddShN5y4dyKI--2Wx_YFthk6YtBVc"),
            Personaje(2, "Julia Melendez",
                "holaaaa", "10:52",
                "https://fastly.picsum.photos/id/200/300/300.jpg?hmac=aX7NyPgACwrm5XddShN5y4dyKI--2Wx_YFthk6YtBVc"),
            Personaje(3, "Luis Perez",
                "holaaaa", "13:52",
                "https://fastly.picsum.photos/id/200/300/300.jpg?hmac=aX7NyPgACwrm5XddShN5y4dyKI--2Wx_YFthk6YtBVc"),
            Personaje(4, "Pedro Medrano",
                "holaaaa", "22:52",
                "https://fastly.picsum.photos/id/200/300/300.jpg?hmac=aX7NyPgACwrm5XddShN5y4dyKI--2Wx_YFthk6YtBVc"),
            Personaje(5, "Rafael Torres",
                "holaaaa", "15:52",
                "https://fastly.picsum.photos/id/200/300/300.jpg?hmac=aX7NyPgACwrm5XddShN5y4dyKI--2Wx_YFthk6YtBVc"),
            Personaje(6, "Miguel Huertas",
                "holaaaa", "12:52",
                "https://fastly.picsum.photos/id/200/300/300.jpg?hmac=aX7NyPgACwrm5XddShN5y4dyKI--2Wx_YFthk6YtBVc"),

            )
    }

}