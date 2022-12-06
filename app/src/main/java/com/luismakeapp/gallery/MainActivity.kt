package com.luismakeapp.gallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.luismakeapp.gallery.ui.theme.GalleryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GalleryTheme {
                LayoutApp()
            }
        }
    }
}

@Composable
fun LayoutApp() {
    //Layout App
}


//Components
@Composable
fun ImageComponent(painter: Painter, modifier: Modifier = Modifier, contentDescription: String){
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier
    )
}

@Composable
fun ButtonComponent(){
    Button(onClick = { /*TODO*/ }) {

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GalleryTheme {
        LayoutApp()
    }
}