import java.util.List;
import lombok.Singular;
@lombok.Builder class BuilderSingularNoAuto {
  public static @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated class BuilderSingularNoAutoBuilder {
    private @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated java.util.ArrayList<String> things;
    private @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated java.util.ArrayList<String> widgets;
    private @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated java.util.ArrayList<String> items;
    @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAutoBuilder() {
      super();
    }
    public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAutoBuilder things(String things) {
      if ((this.things == null))
          this.things = new java.util.ArrayList<String>();
      this.things.add(things);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAutoBuilder things(java.util.Collection<? extends String> things) {
      if ((this.things == null))
          this.things = new java.util.ArrayList<String>();
      this.things.addAll(things);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAutoBuilder clearThings() {
      if ((this.things != null))
          this.things.clear();
      return this;
    }
    public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAutoBuilder widget(String widget) {
      if ((this.widgets == null))
          this.widgets = new java.util.ArrayList<String>();
      this.widgets.add(widget);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAutoBuilder widgets(java.util.Collection<? extends String> widgets) {
      if ((this.widgets == null))
          this.widgets = new java.util.ArrayList<String>();
      this.widgets.addAll(widgets);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAutoBuilder clearWidgets() {
      if ((this.widgets != null))
          this.widgets.clear();
      return this;
    }
    public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAutoBuilder items(String items) {
      if ((this.items == null))
          this.items = new java.util.ArrayList<String>();
      this.items.add(items);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAutoBuilder items(java.util.Collection<? extends String> items) {
      if ((this.items == null))
          this.items = new java.util.ArrayList<String>();
      this.items.addAll(items);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAutoBuilder clearItems() {
      if ((this.items != null))
          this.items.clear();
      return this;
    }
    public @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAuto build() {
      java.util.List<String> things;
      switch (((this.things == null) ? 0 : this.things.size())) {
      case 0 :
          things = java.util.Collections.emptyList();
          break;
      case 1 :
          things = java.util.Collections.singletonList(this.things.get(0));
          break;
      default :
          things = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(this.things));
      }
      java.util.List<String> widgets;
      switch (((this.widgets == null) ? 0 : this.widgets.size())) {
      case 0 :
          widgets = java.util.Collections.emptyList();
          break;
      case 1 :
          widgets = java.util.Collections.singletonList(this.widgets.get(0));
          break;
      default :
          widgets = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(this.widgets));
      }
      java.util.List<String> items;
      switch (((this.items == null) ? 0 : this.items.size())) {
      case 0 :
          items = java.util.Collections.emptyList();
          break;
      case 1 :
          items = java.util.Collections.singletonList(this.items.get(0));
          break;
      default :
          items = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(this.items));
      }
      return new BuilderSingularNoAuto(things, widgets, items);
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated java.lang.String toString() {
      return (((((("BuilderSingularNoAuto.BuilderSingularNoAutoBuilder(things=" + this.things) + ", widgets=") + this.widgets) + ", items=") + this.items) + ")");
    }
  }
  private @Singular List<String> things;
  private @Singular("widget") List<String> widgets;
  private @Singular List<String> items;
  @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAuto(final List<String> things, final List<String> widgets, final List<String> items) {
    super();
    this.things = things;
    this.widgets = widgets;
    this.items = items;
  }
  public static @java.lang.SuppressWarnings("all") @javax.annotation.Generated("lombok") @lombok.Generated BuilderSingularNoAutoBuilder builder() {
    return new BuilderSingularNoAutoBuilder();
  }
}
