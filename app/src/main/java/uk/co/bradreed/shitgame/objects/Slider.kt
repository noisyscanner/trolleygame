package uk.co.bradreed.shitgame.objects

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import uk.co.bradreed.shitgame.GameObject
import uk.co.bradreed.shitgame.GameSurface

class Slider(private val gameSurface: GameSurface): GameObject {

    companion object {
        private const val MAX_HEIGHT = 150
    }

    private val height get() = Math.min(MAX_HEIGHT, gameSurface.height / 10)

    val rect
        get() = Rect(
                0,
                gameSurface.height - height,
                gameSurface.width,
                gameSurface.height
        )

    override fun draw(canvas: Canvas) {
        val paint = Paint()

        paint.color = Color.BLUE

        canvas.drawRect(rect, paint)
    }
}