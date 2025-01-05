package io.github.raboro.taskara

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.himanshoe.charty.gauge.GaugeChart
import com.himanshoe.charty.gauge.config.GaugeChartDefaults
import io.github.raboro.taskara.ui.theme.TaskaraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskaraTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GaugeChart(
                        percentValue = 50,
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(25.dp),
                        gaugeChartConfig = GaugeChartDefaults.gaugeConfigDefaults()
                            .copy(showIndicator = false),
                        needleConfig = GaugeChartDefaults.needleConfigDefaults(),
                        animated = true,
                        animationSpec = tween(),
                    )
                }
            }
        }
    }
}