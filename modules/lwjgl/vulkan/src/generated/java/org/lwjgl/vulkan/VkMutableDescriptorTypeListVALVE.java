/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkMutableDescriptorTypeListEXT}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMutableDescriptorTypeListVALVE {
 *     uint32_t descriptorTypeCount;
 *     VkDescriptorType const * pDescriptorTypes;
 * }</code></pre>
 */
public class VkMutableDescriptorTypeListVALVE extends VkMutableDescriptorTypeListEXT {

    /**
     * Creates a {@code VkMutableDescriptorTypeListVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMutableDescriptorTypeListVALVE(ByteBuffer container) {
        super(container);
    }

    /** Sets the address of the specified {@link IntBuffer} to the {@code pDescriptorTypes} field. */
    @Override
    public VkMutableDescriptorTypeListVALVE pDescriptorTypes(@Nullable @NativeType("VkDescriptorType const *") IntBuffer value) { npDescriptorTypes(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMutableDescriptorTypeListVALVE set(VkMutableDescriptorTypeListVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMutableDescriptorTypeListVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMutableDescriptorTypeListVALVE malloc() {
        return wrap(VkMutableDescriptorTypeListVALVE.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMutableDescriptorTypeListVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMutableDescriptorTypeListVALVE calloc() {
        return wrap(VkMutableDescriptorTypeListVALVE.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMutableDescriptorTypeListVALVE} instance allocated with {@link BufferUtils}. */
    public static VkMutableDescriptorTypeListVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMutableDescriptorTypeListVALVE.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMutableDescriptorTypeListVALVE} instance for the specified memory address. */
    public static VkMutableDescriptorTypeListVALVE create(long address) {
        return wrap(VkMutableDescriptorTypeListVALVE.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMutableDescriptorTypeListVALVE createSafe(long address) {
        return address == NULL ? null : wrap(VkMutableDescriptorTypeListVALVE.class, address);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListVALVE.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListVALVE.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMutableDescriptorTypeListVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListVALVE.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMutableDescriptorTypeListVALVE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkMutableDescriptorTypeListVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMutableDescriptorTypeListVALVE malloc(MemoryStack stack) {
        return wrap(VkMutableDescriptorTypeListVALVE.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMutableDescriptorTypeListVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMutableDescriptorTypeListVALVE calloc(MemoryStack stack) {
        return wrap(VkMutableDescriptorTypeListVALVE.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkMutableDescriptorTypeListVALVE} structs. */
    public static class Buffer extends VkMutableDescriptorTypeListEXT.Buffer {

        private static final VkMutableDescriptorTypeListVALVE ELEMENT_FACTORY = VkMutableDescriptorTypeListVALVE.create(-1L);

        /**
         * Creates a new {@code VkMutableDescriptorTypeListVALVE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMutableDescriptorTypeListVALVE#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkMutableDescriptorTypeListVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the address of the specified {@link IntBuffer} to the {@code pDescriptorTypes} field. */
        @Override
        public VkMutableDescriptorTypeListVALVE.Buffer pDescriptorTypes(@Nullable @NativeType("VkDescriptorType const *") IntBuffer value) { VkMutableDescriptorTypeListVALVE.npDescriptorTypes(address(), value); return this; }

    }

}