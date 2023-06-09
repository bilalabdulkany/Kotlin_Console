// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: addressbook.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package example;

@kotlin.jvm.JvmName("-initializeaddressBook")
public inline fun addressBook(block: example.AddressBookKt.Dsl.() -> kotlin.Unit): example.AddressBook =
  example.AddressBookKt.Dsl._create(example.AddressBook.newBuilder()).apply { block() }._build()
/**
 * ```
 * Our address book file is just one of these.
 * ```
 *
 * Protobuf type `tutorial.AddressBook`
 */
public object AddressBookKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: example.AddressBook.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: example.AddressBook.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): example.AddressBook = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class PeopleProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .tutorial.Person people = 1;`
     */
     public val people: com.google.protobuf.kotlin.DslList<example.Person, PeopleProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getPeopleList()
      )
    /**
     * `repeated .tutorial.Person people = 1;`
     * @param value The people to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addPeople")
    public fun com.google.protobuf.kotlin.DslList<example.Person, PeopleProxy>.add(value: example.Person) {
      _builder.addPeople(value)
    }
    /**
     * `repeated .tutorial.Person people = 1;`
     * @param value The people to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignPeople")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<example.Person, PeopleProxy>.plusAssign(value: example.Person) {
      add(value)
    }
    /**
     * `repeated .tutorial.Person people = 1;`
     * @param values The people to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllPeople")
    public fun com.google.protobuf.kotlin.DslList<example.Person, PeopleProxy>.addAll(values: kotlin.collections.Iterable<example.Person>) {
      _builder.addAllPeople(values)
    }
    /**
     * `repeated .tutorial.Person people = 1;`
     * @param values The people to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllPeople")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<example.Person, PeopleProxy>.plusAssign(values: kotlin.collections.Iterable<example.Person>) {
      addAll(values)
    }
    /**
     * `repeated .tutorial.Person people = 1;`
     * @param index The index to set the value at.
     * @param value The people to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setPeople")
    public operator fun com.google.protobuf.kotlin.DslList<example.Person, PeopleProxy>.set(index: kotlin.Int, value: example.Person) {
      _builder.setPeople(index, value)
    }
    /**
     * `repeated .tutorial.Person people = 1;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearPeople")
    public fun com.google.protobuf.kotlin.DslList<example.Person, PeopleProxy>.clear() {
      _builder.clearPeople()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun example.AddressBook.copy(block: example.AddressBookKt.Dsl.() -> kotlin.Unit): example.AddressBook =
  example.AddressBookKt.Dsl._create(this.toBuilder()).apply { block() }._build()

