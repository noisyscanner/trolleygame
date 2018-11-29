package uk.co.bradreed.trolleygame.food

import android.graphics.Bitmap
import uk.co.bradreed.trolleygame.GameSurface
import uk.co.bradreed.trolleygame.R
import uk.co.bradreed.trolleygame.Sprite
import uk.co.bradreed.trolleygame.structs.Point

@Sprite(layout = R.drawable.strawberry, probability = 0.4)
class Strawberry(bitmap: Bitmap, initialLocation: Point) :
        FoodItem(bitmap, initialLocation) {

    override val value = 1

}