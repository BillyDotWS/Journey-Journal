// Generated by view binder compiler. Do not edit!
package ws.billy.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ws.billy.app.R;

public final class NavigationLayoutBinding implements ViewBinding {
  @NonNull
  private final SlidingPaneLayout rootView;

  @NonNull
  public final SlidingPaneLayout SlidingPanel;

  @NonNull
  public final Button button1;

  @NonNull
  public final Button button2;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button4;

  @NonNull
  public final Button button5;

  @NonNull
  public final Button button6;

  @NonNull
  public final Button button7;

  @NonNull
  public final LinearLayout menuContainer;

  @NonNull
  public final Toolbar toolbar;

  private NavigationLayoutBinding(@NonNull SlidingPaneLayout rootView,
      @NonNull SlidingPaneLayout SlidingPanel, @NonNull Button button1, @NonNull Button button2,
      @NonNull Button button3, @NonNull Button button4, @NonNull Button button5,
      @NonNull Button button6, @NonNull Button button7, @NonNull LinearLayout menuContainer,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.SlidingPanel = SlidingPanel;
    this.button1 = button1;
    this.button2 = button2;
    this.button3 = button3;
    this.button4 = button4;
    this.button5 = button5;
    this.button6 = button6;
    this.button7 = button7;
    this.menuContainer = menuContainer;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public SlidingPaneLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NavigationLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NavigationLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.navigation_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NavigationLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      SlidingPaneLayout SlidingPanel = rootView.findViewById(R.id.SlidingPanel);
      if (SlidingPanel == null) {
        missingId = "SlidingPanel";
        break missingId;
      }
      Button button1 = rootView.findViewById(R.id.button1);
      if (button1 == null) {
        missingId = "button1";
        break missingId;
      }
      Button button2 = rootView.findViewById(R.id.button2);
      if (button2 == null) {
        missingId = "button2";
        break missingId;
      }
      Button button3 = rootView.findViewById(R.id.button3);
      if (button3 == null) {
        missingId = "button3";
        break missingId;
      }
      Button button4 = rootView.findViewById(R.id.button4);
      if (button4 == null) {
        missingId = "button4";
        break missingId;
      }
      Button button5 = rootView.findViewById(R.id.button5);
      if (button5 == null) {
        missingId = "button5";
        break missingId;
      }
      Button button6 = rootView.findViewById(R.id.button6);
      if (button6 == null) {
        missingId = "button6";
        break missingId;
      }
      Button button7 = rootView.findViewById(R.id.button7);
      if (button7 == null) {
        missingId = "button7";
        break missingId;
      }
      LinearLayout menuContainer = rootView.findViewById(R.id.menuContainer);
      if (menuContainer == null) {
        missingId = "menuContainer";
        break missingId;
      }
      Toolbar toolbar = rootView.findViewById(R.id.toolbar);
      if (toolbar == null) {
        missingId = "toolbar";
        break missingId;
      }
      return new NavigationLayoutBinding((SlidingPaneLayout) rootView, SlidingPanel, button1,
          button2, button3, button4, button5, button6, button7, menuContainer, toolbar);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}