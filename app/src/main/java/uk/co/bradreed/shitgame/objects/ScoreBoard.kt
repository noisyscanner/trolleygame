package uk.co.bradreed.trolleygame.objects

import android.graphics.Canvas
import android.graphics.Paint
import android.support.v4.content.res.ResourcesCompat
import uk.co.bradreed.trolleygame.GameObject
import uk.co.bradreed.trolleygame.GameSurface
import uk.co.bradreed.trolleygame.R
import uk.co.bradreed.trolleygame.structs.Point
import uk.co.bradreed.trolleygame.structs.Score

class ScoreBoard(private val gameSurface: GameSurface,
                 private val location: Point,
                 var score: Score): GameObject {

    override fun draw(canvas: Canvas) {
        val fontSize = 50f
        val basePaint = Paint().apply {
            textSize = fontSize
            isFakeBoldText = true
        }

        val greenPaint = Paint(basePaint).apply {
            color = ResourcesCompat.getColor(gameSurface.resources, R.color.green, null)
        }
        val redPaint = Paint(basePaint).apply {
            color = ResourcesCompat.getColor(gameSurface.resources, R.color.red, null)
        }

        canvas.drawText("✅ ${score.caught}", location.x.toFloat(), location.y.toFloat(), greenPaint)
        canvas.drawText("❌ ${score.dropped}", location.x.toFloat(), location.y.toFloat() + fontSize, redPaint)
    }
}