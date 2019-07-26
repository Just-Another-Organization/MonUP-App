package giovanni.tradingtoolkit.home_widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

import giovanni.tradingtoolkit.R;

/**
 * Implementation of App Widget functionality.
 * App Widget Configuration implemented in {@link personalizable_coin_list_widgetConfigureActivity personalizable_coin_list_widgetConfigureActivity}
 */
public class personalizable_coin_list_widget extends AppWidgetProvider {

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

       //  CharSequence widgetText = personalizable_coin_list_widgetConfigureActivity.loadTitlePref(context, appWidgetId);
        // Construct the RemoteViews object
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.personalizable_coin_list_widget);
       //  views.setTextViewText(R.id.appwidget_text, widgetText);

        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        // When the user deletes the widget, delete the preference associated with it.
        // for (int appWidgetId : appWidgetIds) {
        //    personalizable_coin_list_widgetConfigureActivity.deleteTitlePref(context, appWidgetId);
        //}
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

