package com.blog.validation.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Person}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson.builder()}.
 */
@Generated(from = "Person", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePerson implements Person, Serializable {
  private final long longVal;
  private final int id;
  private final String name;
  private final String strDate;

  private ImmutablePerson(long longVal, int id, String name, String strDate) {
    this.longVal = longVal;
    this.id = id;
    this.name = name;
    this.strDate = strDate;
  }

  /**
   * @return The value of the {@code longVal} attribute
   */
  @JsonProperty("longVal")
  @Override
  public long getLongVal() {
    return longVal;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public int getId() {
    return id;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String getName() {
    return name;
  }

  /**
   * @return The value of the {@code strDate} attribute
   */
  @JsonProperty("strDate")
  @Override
  public String getStrDate() {
    return strDate;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#getLongVal() longVal} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for longVal
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withLongVal(long value) {
    if (this.longVal == value) return this;
    return new ImmutablePerson(value, this.id, this.name, this.strDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#getId() id} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withId(int value) {
    if (this.id == value) return this;
    return new ImmutablePerson(this.longVal, value, this.name, this.strDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutablePerson(this.longVal, this.id, newValue, this.strDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person#getStrDate() strDate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for strDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson withStrDate(String value) {
    String newValue = Objects.requireNonNull(value, "strDate");
    if (this.strDate.equals(newValue)) return this;
    return new ImmutablePerson(this.longVal, this.id, this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson
        && equalTo((ImmutablePerson) another);
  }

  private boolean equalTo(ImmutablePerson another) {
    return longVal == another.longVal
        && id == another.id
        && name.equals(another.name)
        && strDate.equals(another.strDate);
  }

  /**
   * Computes a hash code from attributes: {@code longVal}, {@code id}, {@code name}, {@code strDate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + (int) (longVal ^ (longVal >>> 32));
    h += (h << 5) + id;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + strDate.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Person} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Person{"
        + "longVal=" + longVal
        + ", id=" + id
        + ", name=" + name
        + ", strDate=" + strDate
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Person", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Person, Serializable {
    long longVal;
    boolean longValIsSet;
    int id;
    boolean idIsSet;
    String name;
    String strDate;
    @JsonProperty("longVal")
    public void setLongVal(long longVal) {
      this.longVal = longVal;
      this.longValIsSet = true;
    }
    @JsonProperty("id")
    public void setId(int id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("strDate")
    public void setStrDate(String strDate) {
      this.strDate = strDate;
    }
    @Override
    public long getLongVal() { throw new UnsupportedOperationException(); }
    @Override
    public int getId() { throw new UnsupportedOperationException(); }
    @Override
    public String getName() { throw new UnsupportedOperationException(); }
    @Override
    public String getStrDate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePerson fromJson(Json json) {
    ImmutablePerson.Builder builder = ImmutablePerson.builder();
    if (json.longValIsSet) {
      builder.longVal(json.longVal);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.strDate != null) {
      builder.strDate(json.strDate);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Person} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Person instance
   */
  public static ImmutablePerson copyOf(Person instance) {
    if (instance instanceof ImmutablePerson) {
      return (ImmutablePerson) instance;
    }
    return ImmutablePerson.builder()
        .from(instance)
        .build();
  }

  /**
   * The serialized form captures the structural content of the value object,
   * providing the ability to reconstruct values with the capability to migrate
   * data. Uses optional, nullable, and provides flexible handling of
   * collection attributes.
   */
  @Generated(from = "Person", generator = "Immutables")
  private static class SerialForm implements Serializable {
    private static final long serialVersionUID = 0L;
    private final String[] names;
    private final Object[] values;
    SerialForm(ImmutablePerson instance) {
      List<String> names = new ArrayList<>(4);
      List<Object> values = new ArrayList<>(4);
      names.add("longVal");
      values.add(instance.getLongVal());
      names.add("id");
      values.add(instance.getId());
      names.add("name");
      values.add(instance.getName());
      names.add("strDate");
      values.add(instance.getStrDate());
      this.names = names.toArray(new String[names.size()]);
      this.values = values.toArray();
    }

    Object readResolve() {
      ImmutablePerson.Builder builder = ImmutablePerson.builder();

      for (int i = 0; i < names.length; i++) {
        String name = names[i];
        if ("longVal".equals(name)) {
          builder.longVal((Long) toSingle("longVal", values[i]));
          continue;
        }
        if ("id".equals(name)) {
          builder.id((Integer) toSingle("id", values[i]));
          continue;
        }
        if ("name".equals(name)) {
          builder.name((String) toSingle("name", values[i]));
          continue;
        }
        if ("strDate".equals(name)) {
          builder.strDate((String) toSingle("strDate", values[i]));
          continue;
        }
      }
      return builder.build();
    }

    private static Object toSingle(String attribute, Object value) {
      if (value instanceof Object[]) {
        Object[] elements = (Object[]) value;
        if (elements.length == 1) {
          return elements[0];
        }
        throw new IllegalStateException("Cannot extract scalar value for attribute '"
            + attribute + "' from array of length " + elements.length);
      }
      return value;
    }
  }

  private Object writeReplace() {
    return new SerialForm(this);
  }

  /**
   * Creates a builder for {@link ImmutablePerson ImmutablePerson}.
   * <pre>
   * ImmutablePerson.builder()
   *    .longVal(long) // required {@link Person#getLongVal() longVal}
   *    .id(int) // required {@link Person#getId() id}
   *    .name(String) // required {@link Person#getName() name}
   *    .strDate(String) // required {@link Person#getStrDate() strDate}
   *    .build();
   * </pre>
   * @return A new ImmutablePerson builder
   */
  public static ImmutablePerson.Builder builder() {
    return new ImmutablePerson.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePerson ImmutablePerson}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Person", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_LONG_VAL = 0x1L;
    private static final long INIT_BIT_ID = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private static final long INIT_BIT_STR_DATE = 0x8L;
    private long initBits = 0xfL;

    private long longVal;
    private int id;
    private String name;
    private String strDate;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Person} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Person instance) {
      Objects.requireNonNull(instance, "instance");
      longVal(instance.getLongVal());
      id(instance.getId());
      name(instance.getName());
      strDate(instance.getStrDate());
      return this;
    }

    /**
     * Initializes the value for the {@link Person#getLongVal() longVal} attribute.
     * @param longVal The value for longVal 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("longVal")
    public final Builder longVal(long longVal) {
      this.longVal = longVal;
      initBits &= ~INIT_BIT_LONG_VAL;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(int id) {
      this.id = id;
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Person#getStrDate() strDate} attribute.
     * @param strDate The value for strDate 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("strDate")
    public final Builder strDate(String strDate) {
      this.strDate = Objects.requireNonNull(strDate, "strDate");
      initBits &= ~INIT_BIT_STR_DATE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePerson ImmutablePerson}.
     * @return An immutable instance of Person
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePerson build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePerson(longVal, id, name, strDate);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_LONG_VAL) != 0) attributes.add("longVal");
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_STR_DATE) != 0) attributes.add("strDate");
      return "Cannot build Person, some of required attributes are not set " + attributes;
    }
  }
}
